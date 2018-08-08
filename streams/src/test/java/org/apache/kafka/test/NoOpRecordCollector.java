/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.test;

import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.processor.StreamPartitioner;
import org.apache.kafka.streams.processor.internals.RecordCollector;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoOpRecordCollector implements RecordCollector {

    @Override
    public <K, V> void send(final String topic,
                            K key,
                            V value,
                            Integer partition,
                            Long timestamp,
                            Serializer<K> keySerializer,
                            Serializer<V> valueSerializer) {
        // no-op
    }

    @Override
    public <K, V> void send(final String topic,
                                K key,
                                V value,
                                Integer partition,
                                Long timestamp,
                                Serializer<K> keySerializer,
                                Serializer<V> valueSerializer,
                                StreamPartitioner<? super K, ? super V> partitioner) {
        // no-op
    }

    @Override
    public <K, V> void broadcast(final String topic,
                                 K key,
                                 V value,
                                 Long timestamp,
                                 Serializer<K> keySerializer,
                                 Serializer<V> valueSerializer) {
        // no-op
    }

    @Override
    public <K, V> void broadcast(final String topic,
                          K key,
                          V value,
                          Set<Integer> partitions,
                          Long timestamp,
                          Serializer<K> keySerializer,
                          Serializer<V> valueSerializer) {
        // no-op
    }


    @Override
    public List<Integer> partitionSetForTopic(String topic) {
        return Collections.emptyList();
    }

    @Override
    public void flush() {
        //no-op
    }

    @Override
    public void close() {
        //no-op
    }

    @Override
    public Map<TopicPartition, Long> offsets() {
        return Collections.emptyMap();
    }
}
