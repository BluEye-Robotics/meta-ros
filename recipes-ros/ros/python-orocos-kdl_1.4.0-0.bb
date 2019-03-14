DESCRIPTION = "This package contains the python bindings PyKDL for the Kinematics and Dynamics Library (KDL), distributed by the Orocos Project."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "orocos-kdl sip catkin orocos-kdl sip"

RDEPENDS_${PN} = "catkin orocos-kdl sip"

SRC_URI = "https://github.com/orocos/orocos-kdl-release/archive/release/melodic/python_orocos_kdl/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "150762ff8a44859cce1d425d54b13990"
SRC_URI[sha256sum] = "e2f7f6fafccaf26d88863ac50b826301c14db71f61e4caff757a482e304a62a0"

ROS_SPN = "orocos_kinematics_dynamics"
S = "${WORKDIR}/orocos-kdl-release-release-melodic-python_orocos_kdl-1.4.0-0"

inherit catkin
