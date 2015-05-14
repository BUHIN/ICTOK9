select * from uservo
select * from boardvo

CREATE table "USERVO" (
    "ID"         VARCHAR2(4000) NOT NULL,
    "PASSWORD"   VARCHAR2(4000) NOT NULL,
    "NAME"       VARCHAR2(4000),
    constraint  "USERVO_PK" primary key ("ID")
)
CREATE table "BOARDVO" (
    "BSEQ"       NUMBER(10),
    "ID"         VARCHAR2(4000),
    "BTITLE"     VARCHAR2(4000),
    "BCONTENT"   VARCHAR2(4000),
    "BDATE"      VARCHAR2(4000),
    constraint  "BOARDVO_PK" primary key ("BSEQ")
)
/
delete from boardvo
ALTER TABLE "BOARDVO" ADD CONSTRAINT "BOARDVO_FK" 
FOREIGN KEY ("ID")
REFERENCES "USERVO" ("ID")

