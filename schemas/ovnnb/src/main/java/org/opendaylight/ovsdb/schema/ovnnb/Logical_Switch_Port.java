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
 * This class is a typed interface to the Logical_Switch_Port Table
 */
@TypedTable(name="Logical_Switch_Port", database="OVN_Northbound", fromVersion="1.0.0")
public interface Logical_Switch_Port extends TypedBaseTable<GenericTableSchema> {

    @TypedColumn(name="name", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getNameColumn();
    @TypedColumn(name="name", method=MethodType.GETDATA, fromVersion="1.0.0")
    String getName();
    @TypedColumn(name="name", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setName(String name);

    @TypedColumn(name="type", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getTypeColumn();
    @TypedColumn(name="type", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setType(String type);

    @TypedColumn(name="options", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getOptionsColumn();
    @TypedColumn(name="options", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setOptions(Map<String, String> options);

    @TypedColumn(name="parent_name", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getParentNameColumn();
    @TypedColumn(name="parent_name", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setParentName(String parent_name);

    @TypedColumn(name="tag_request", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getTagRequestColumn();
    @TypedColumn(name="tag_request", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setTagRequest(Long tag_request);

    @TypedColumn(name="tag", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Long> getTagColumn();
    @TypedColumn(name="tag", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setTag(Long tag);

    @TypedColumn(name="up", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Boolean> getUpColumn();
    @TypedColumn(name="up", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setUpName(Boolean up);

    @TypedColumn(name="enable", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Boolean> getEnableColumn();
    @TypedColumn(name="enable", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setEnable(Boolean enable);

    @TypedColumn(name="addresses", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<String>> getAddressesColumn() ;
    @TypedColumn(name="addresses", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setAddresses(Set<String> addresses) ;

    @TypedColumn(name="dynamic_addresses", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, String> getDynamicAddressesColumn();
    @TypedColumn(name="dynamic_addresses", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setDynamicAddresses(String dynamic_addresses);

    @TypedColumn(name="port_security", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<String>> getPortSecurityColumn() ;
    @TypedColumn(name="port_security", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setPortSecurity(Set<String> port_security) ;

    @TypedColumn(name="dhcpv4_options", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<String>> getDhcpv4OptionsColumn() ;
    @TypedColumn(name="dhcpv4_options", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setDhcpv4Options(Set<String> dhcpv4_options) ;

    @TypedColumn(name="dhcpv6_options", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Set<UUID>> getDhcpv6OptionsColumn() ;
    @TypedColumn(name="dhcpv6_options", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setDhcpv6Options(Set<UUID> dhcpv6_options) ;

    @TypedColumn(name="external_ids", method=MethodType.GETCOLUMN, fromVersion="1.0.0")
    Column<GenericTableSchema, Map<String, String>> getExternalIdsColumn();
    @TypedColumn(name="external_ids", method=MethodType.SETDATA, fromVersion="1.0.0")
    void setExternalIds(Map<String, String> externalIds);

}
