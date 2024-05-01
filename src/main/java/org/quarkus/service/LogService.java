package org.quarkus.service;

import org.quarkus.model.Log;

import java.util.List;

public interface LogService {
  List<Log> getData(int N);
}