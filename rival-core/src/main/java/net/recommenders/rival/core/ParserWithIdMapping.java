/*
 * Copyright 2015 recommenders.net.
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
package net.recommenders.rival.core;

import java.io.File;
import java.io.IOException;

/**
 * Parser of files where users or items are not represented as integer ids.
 *
 * @author <a href="http://github.com/abellogin">Alejandro</a>
 *
 * @param <U> generic type of users
 * @param <I> generic type of items
 */
public interface ParserWithIdMapping<U, I> {

    /**
     * Parse data file.
     *
     * @param f The file to parse.
     * @param mapIdsPrefix The prefix of the file where the id mapping will be
     * stored (and will be read from).
     * @return The data model created from the file.
     * @throws IOException if the file cannot be read.
     */
    DataModel<U, I> parseData(File f, String mapIdsPrefix) throws IOException;
}
