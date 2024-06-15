import argparse
import os
import json

with open("configuration.json", "r") as file:
    configuration = json.load(file)

ROOT_DIRECTORY = configuration["projectRoot"]["name"]
MODULE_DIRECTORIES = configuration["moduleConfig"]["paths"]
POM_TEMPLATE_FILE = configuration["moduleConfig"]["fileTemplates"]["pomFile"]["templatePath"]
POM_OUTPUT_FILE = configuration["moduleConfig"]["fileTemplates"]["pomFile"]["outputPath"]
EMPTY_FILE = configuration["moduleConfig"]["fileTemplates"]["emptyFile"]

parser = argparse.ArgumentParser()
parser.add_argument("-p", required = True, help = "Name of the parent module")
parser.add_argument("-m", required = True, help = "Name of the module ")
args = parser.parse_args()

def find_parent_directory():
    directory = os.path.dirname(os.path.abspath(__file__))
    while os.path.basename(directory) != ROOT_DIRECTORY:
        directory = os.path.dirname(directory)
    for root, dirs, _ in os.walk(directory):
        if args.p in dirs:
            return os.path.join(root, args.p)
    return None

def create_module_structure():
    parent_directory = find_parent_directory()
    if parent_directory is not None:
        module_directory = os.path.join(parent_directory, args.m)
        os.makedirs(module_directory)
        for directory in MODULE_DIRECTORIES:
            os.makedirs(os.path.join(module_directory, directory))
            open(os.path.join(module_directory, directory, EMPTY_FILE), 'a').close()

def manage_pom_files():
    parent_directory = find_parent_directory()
    if parent_directory is not None:
        module_directory = os.path.join(parent_directory, args.m)
        with open(POM_TEMPLATE_FILE, 'r') as file:
            content = file.read().replace("{ module }", args.m).replace("{ parent }", args.p)
        with open(os.path.join(module_directory, POM_OUTPUT_FILE), 'w') as file:
            file.write(content)
        with open(os.path.join(parent_directory, POM_OUTPUT_FILE), 'r') as file:
            content = file.readlines()
        with open(os.path.join(parent_directory, POM_OUTPUT_FILE), 'w') as file:
            for line in content:
                if "</modules>" in line:
                    file.write(f"        <module>{args.m}</module>\n")
                file.write(line)

create_module_structure()
manage_pom_files()