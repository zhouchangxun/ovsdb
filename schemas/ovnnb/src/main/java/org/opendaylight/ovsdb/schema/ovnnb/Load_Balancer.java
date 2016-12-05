/*
 * Copyright (c) 2016 DT-Dream and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;

import java.util.Map;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the Load_Balancer Table
 */
@TypedTable(name="Load_Balancer", database="OVN_Northbound", fromVersion="1.0.0")
public interface Load_Balancer extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="vips", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getVipsColumn();
    @TypedColumn(name="vips", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setVips(String vips);  //Examples: "10.0.0.1, 10.0.0.2" and "20.0.0.10:8800, 20.0.0.11:8800".

    @TypedColumn(name="protocol", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getProtocolColumn();
    @TypedColumn(name="protocol", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setProtocol(String protocol);  //optional string, either "udp" or "tcp"

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);

}
