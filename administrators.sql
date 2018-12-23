-- Table: public.administrators

-- DROP TABLE public.administrators;

CREATE TABLE public.administrators
(
  userid integer NOT NULL,
  superuserid integer NOT NULL,
  username character varying(255) NOT NULL,
  enterdate character varying(255) NOT NULL,
  usersalary double precision NOT NULL,
  userage integer NOT NULL,
  CONSTRAINT administrators_pk PRIMARY KEY (userid),
  CONSTRAINT administrator_fk FOREIGN KEY (superuserid)
      REFERENCES public.superusers (superuserid) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.administrators
  OWNER TO postgres;
