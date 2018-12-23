-- Table: public.superusers

-- DROP TABLE public.superusers;

CREATE TABLE public.superusers
(
  superuserid integer NOT NULL,
  superusername character varying(255) NOT NULL,
  CONSTRAINT superusers_pk PRIMARY KEY (superuserid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.superusers
  OWNER TO postgres;
