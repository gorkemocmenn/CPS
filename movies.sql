-- Table: public.movies

-- DROP TABLE public.movies;

CREATE TABLE public.movies
(
  moviename character varying(255) NOT NULL,
  director character varying(255) NOT NULL,
  description text NOT NULL,
  releasedate character varying(255) NOT NULL,
  durationtime double precision NOT NULL,
  CONSTRAINT movies_pk PRIMARY KEY (moviename)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.movies
  OWNER TO postgres;