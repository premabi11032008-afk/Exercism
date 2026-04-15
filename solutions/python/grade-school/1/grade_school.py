class School:
    def __init__(self):
        self.res = []
        self.students = {} 

    def add_student(self, name, grade):
        if name in self.roster():
            self.res.append(False)
            return

        if grade in self.students:
            self.students[grade].append(name)
        else:
            self.students[grade] = [name]
    
        self.res.append(True)


    def roster(self):
        new = []
        for grade in sorted(self.students):   # sort grades
            new += sorted(self.students[grade])
        return new

    def grade(self, grade_number):
        return sorted(self.students.get(grade_number, []))

    def added(self):
        return self.res
