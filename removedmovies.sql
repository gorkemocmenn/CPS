-- Table: public.removedmovies

-- DROP TABLE public.removedmovies;

CREATE TABLE public.removedmovies
(
  moviename character varying(255) NOT NULL,
  director character varying(255) NOT NULL,
  description text NOT NULL,
  releasedate character varying(255) NOT NULL,
  durationtime double precision NOT NULL,
  CONSTRAINT removedmovies_pk PRIMARY KEY (moviename)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.removedmovies
  OWNER TO postgres;