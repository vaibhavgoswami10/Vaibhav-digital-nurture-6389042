CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_Department IN VARCHAR2,
    p_BonusPercent IN NUMBER
) IS
BEGIN
    FOR emp IN (
        SELECT EmployeeID, Salary
        FROM Employees
        WHERE Department = p_Department
    ) LOOP
        UPDATE Employees
        SET Salary = Salary + (Salary * p_BonusPercent / 100)
        WHERE EmployeeID = emp.EmployeeID;
    END LOOP;

    COMMIT;
END;