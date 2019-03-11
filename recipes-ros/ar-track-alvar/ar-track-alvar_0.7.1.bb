DESCRIPTION = "This package is a ROS wrapper for Alvar, an open source AR tag tracking library."
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=061abe8dc89f326789675967c8760541"

DEPENDS = "ar-track-alvar-msgs cmake-modules cv-bridge image-transport libtinyxml pcl-ros resource-retriever roscpp tf visualization-msgs"

require ar-track-alvar.inc

SRC_URI += "file://0001-Add-opencv-header.patch;striplevel=2"
