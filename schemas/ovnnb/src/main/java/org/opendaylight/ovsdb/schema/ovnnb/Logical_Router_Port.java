/*
 * Copyright (c) 2016 DT-Dream, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.schema.ovnnb;
import java.util.Map;
import java.util.Set;

import org.opendaylight.ovsdb.lib.notation.Column;
import org.opendaylight.ovsdb.lib.notation.UUID;
import org.opendaylight.ovsdb.lib.schema.GenericTableSchema;
import org.opendaylight.ovsdb.lib.schema.typed.MethodType;
import org.opendaylight.ovsdb.lib.schema.typed.TypedBaseTable;
import org.opendaylight.ovsdb.lib.schema.typed.TypedColumn;
import org.opendaylight.ovsdb.lib.schema.typed.TypedTable;

/**
 * This class is a typed interface to the Logical_Router_Port Table
 */
@TypedTable(name="Logical_Router_Port", database="OVN_Northbound", fromVersion="1.0.0")
public interface Logical_Router_Port extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="name", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getNameColumn();
    @TypedColumn(name="name", method=MethodType.GETDATA, fromVersion="1.0.0")
    String getName();
    @TypedColumn(name="name", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setName(String name);

    @TypedColumn(name="networks", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<String>> getNetworksColumn() ;
    @TypedColumn(name="networks", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setNetworks(Set<String> networks) ;

    @TypedColumn(name="mac", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getMacColumn();
    @TypedColumn(name="mac", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setMac(String mac);

    @TypedColumn(name="enabled", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Boolean> getEnabledColumn();
    @TypedColumn(name="enabled", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setEnabled(Boolean enabled);

    @TypedColumn(name="options", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getOptionsColumn();
    @TypedColumn(name="options", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setOptions(Map<String, String> options);

    // Connect two logical routers, this identifies the other router port in the pair by name.
    @TypedColumn(name="peer", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getPeerColumn();
    @TypedColumn(name="peer", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setPeer(String peer);

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);

}
