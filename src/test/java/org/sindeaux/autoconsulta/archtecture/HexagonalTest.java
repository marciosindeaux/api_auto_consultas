package org.sindeaux.autoconsulta.archtecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

@AnalyzeClasses(packages = "org.sindeaux.autoconsulta")
public class HexagonalTest {

    @ArchTest
    public static final ArchRule layersValidator = Architectures.layeredArchitecture()
            .layer("Config").definedBy("..configs..")
            .layer("Datasource").definedBy("..datasources..")
}
