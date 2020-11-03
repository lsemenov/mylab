DROP TABLE IF EXISTS kaggle_ranking CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE kaggle_ranking(
    id        INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    rank        INTEGER     NOT NULL,
    tier        VARCHAR     NOT NULL,
    username    VARCHAR     NOT NULL,
    points      INTEGER     NOT NULL
);
