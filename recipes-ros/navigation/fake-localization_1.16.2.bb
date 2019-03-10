DESCRIPTION = "A ROS node that simply forwards odometry information."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles roscpp rosconsole nav-msgs geometry-msgs tf message-filters rospy tf2-geometry-msgs"

require navigation.inc

SRC_URI += "file://0001-remove-deprecated-and-unused-boost-signals.patch;striplevel=2"
