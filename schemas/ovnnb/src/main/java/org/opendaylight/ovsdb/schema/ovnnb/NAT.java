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
 * This class is a typed interface to the NAT Table
 */
@TypedTable(name="NAT", database="OVN_Northbound", fromVersion="1.0.0")
public interface NAT extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="type", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getTypeColumn();
    @TypedColumn(name="type", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setType(String name);

    @TypedColumn(name="external_ip", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getExternalIpColumn();
    @TypedColumn(name="external_ip", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIp(String external_ip);

    @TypedColumn(name="logical_ip", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getLogicalIpColumn();
    @TypedColumn(name="logical_ip", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setLogicalIp(String logical_ip);

//    FIXME: To be uncommented when NAT supports external_ids column
//    @TypedColumn (name="external_ids", method= MethodType.GETCOLUMN, fromVersion="1.0.0")
//    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
//    @TypedColumn (name="external_ids", method= MethodType.SETDATA, fromVersion="1.0.0")
//    void setExternalIds(Map<String, String> externalIds);

}
