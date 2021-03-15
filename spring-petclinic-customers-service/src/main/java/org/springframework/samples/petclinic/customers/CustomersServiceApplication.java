/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.customers;

import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.nativex.hint.AccessBits;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.hint.TypeHints;

import java.util.HashSet;

/**
 * @author Maciej Szarlinski
 */
@EnableDiscoveryClient
@SpringBootApplication
@TypeHints({
    @TypeHint(types = {HttpStatus.class, SqlDateSerializer.class, HashSet.class}, access = AccessBits.ALL)
})
public class CustomersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomersServiceApplication.class, args);
	}
}
