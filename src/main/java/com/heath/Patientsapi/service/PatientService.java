package com.heath.Patientsapi.service;

import com.heath.Patientsapi.models.PatientModel;
import com.heath.Patientsapi.repositories.PatientRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Service
public class PatientService {

    final PatientRepository patientRepository;

    public PatientService (PatientRepository patientRepository){
        this.patientRepository = new PatientRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends PatientModel> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends PatientModel> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<PatientModel> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public PatientModel getOne(UUID uuid) {
                return null;
            }

            @Override
            public PatientModel getById(UUID uuid) {
                return null;
            }

            @Override
            public PatientModel getReferenceById(UUID uuid) {
                return null;
            }

            @Override
            public <S extends PatientModel> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends PatientModel> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends PatientModel> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<PatientModel> findAll() {
                return null;
            }

            @Override
            public List<PatientModel> findAllById(Iterable<UUID> uuids) {
                return null;
            }

            @Override
            public <S extends PatientModel> S save(S entity) {
                return null;
            }

            @Override
            public Optional<PatientModel> findById(UUID uuid) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(UUID uuid) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(UUID uuid) {

            }

            @Override
            public void delete(PatientModel entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends UUID> uuids) {

            }

            @Override
            public void deleteAll(Iterable<? extends PatientModel> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<PatientModel> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<PatientModel> findAll(Pageable pageable) {
                return  patientRepository.findAll(pageable);
            }

            @Override
            public <S extends PatientModel> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends PatientModel> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends PatientModel> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends PatientModel> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends PatientModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        }
    }
}
