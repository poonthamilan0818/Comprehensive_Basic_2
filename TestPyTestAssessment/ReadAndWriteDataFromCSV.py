import csv
import os



class ReadAndWriteDataFromCSV:

    def __init__(self, file_name):
        self.file_name = file_name

    def read_csv(self):
        try:
            with open(self.file_name, mode='r') as file:
                csv_reader = csv.DictReader(file)
                for row in csv_reader:
                    print(f"Name: {row['Name']}, SkillSet: {row['SkillSet']}, Experience: {row['Experience']}")
        except FileNotFoundError:
            print(f"File '{self.file_name}' not found.")
        except Exception as e:
            print(f"An error occurred: {e}")

if __name__ == "__main__":
    data_file = "data.csv"  # Replace with the actual file path
    reader = ReadAndWriteDataFromCSV(os.getcwd() + '//TestData.csv')
    reader.read_csv()
