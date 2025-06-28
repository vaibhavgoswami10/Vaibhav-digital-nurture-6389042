create or replace PROCEDURE loansDue is
BEGIN
    FOR loan_rec IN (
        SELECT l.LoanID, l.EndDate, c.CustomerID, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: LoanID ' || loan_rec.LoanID ||
            ' for Customer "' || loan_rec.Name || '" (CustomerID: ' || loan_rec.CustomerID || ')' ||
            ' is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;