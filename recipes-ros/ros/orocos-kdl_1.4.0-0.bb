DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics Library (KDL), distributed by the Orocos Project."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libeigen catkin libeigen pkgconfig"

RDEPENDS_${PN} = "catkin libeigen pkgconfig"

SRC_URI = "https://github.com/orocos/orocos-kdl-release/archive/release/melodic/orocos_kdl/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a22a8fc5c7d1581bab816b75b9ada00"
SRC_URI[sha256sum] = "aa01563f804f8c52c6403b872b0a321abd916083757aebf25ac9530c7798830a"

ROS_SPN = "orocos_kinematics_dynamics"
S = "${WORKDIR}/orocos-kdl-release-release-melodic-orocos_kdl-1.4.0-0"

inherit catkin
