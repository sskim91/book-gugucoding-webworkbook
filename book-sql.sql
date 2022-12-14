SELECT NOW();

CREATE TABLE TBL_TODO
(
    TNO      INT AUTO_INCREMENT PRIMARY KEY,
    TITLE    VARCHAR(100) NOT NULL,
    DUEDATE  DATE         NOT NULL,
    FINISHED TINYINT DEFAULT 0
);

INSERT INTO TBL_TODO(
    TITLE
,   DUEDATE
,   FINISHED)
    VALUE ('test...', '2022-12-31', 1);

CREATE TABLE TBL_MEMBER
(
    MID   VARCHAR(50) PRIMARY KEY,
    MPW   VARCHAR(50)  NOT NULL,
    MNAME VARCHAR(100) NOT NULL
);

INSERT INTO TBL_MEMBER (
    MID
,   MPW
,   MNAME) VALUE ('user00', '1111', '사용자0');
INSERT INTO TBL_MEMBER (
    MID
,   MPW
,   MNAME) VALUE ('user01', '1111', '사용자1');
INSERT INTO TBL_MEMBER (
    MID
,   MPW
,   MNAME) VALUE ('user02', '1111', '사용자2');

ALTER TABLE TBL_MEMBER
    ADD COLUMN UUID VARCHAR(50);

SELECT *
FROM TBL_MEMBER;

DROP TABLE IF EXISTS TBL_TODO;

CREATE TABLE TBL_TODO
(
    TNO      INT AUTO_INCREMENT PRIMARY KEY,
    TITLE    VARCHAR(100) NOT NULL,
    DUEDATE  DATE         NOT NULL,
    WRITER   VARCHAR(50)  NOT NULL,
    FINISHED TINYINT DEFAULT 0
);

SELECT *
FROM TBL_TODO;

INSERT INTO TBL_TODO (
    TITLE
,   DUEDATE
,   WRITER) (
            SELECT TITLE
                 , DUEDATE
                 , WRITER
            FROM TBL_TODO
            );

SELECT COUNT(TNO)
FROM TBL_TODO;

SELECT *
FROM TBL_TODO
ORDER BY TNO DESC;

SELECT *
FROM TBL_TODO
ORDER BY TNO DESC
LIMIT 10;

SELECT *
FROM TBL_TODO
ORDER BY TNO DESC
LIMIT 10, 10;

CREATE TABLE PERSISTENT_LOGINS
(
    USERNAME  VARCHAR(64) NOT NULL,
    SERIES    VARCHAR(64) PRIMARY KEY,
    TOKEN     VARCHAR(64) NOT NULL,
    LAST_USED TIMESTAMP   NOT NULL
)