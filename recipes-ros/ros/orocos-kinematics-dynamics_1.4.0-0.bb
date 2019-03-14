DESCRIPTION = "This package depends on a recent version of the Kinematics and Dynamics Library (KDL), distributed by the Orocos Project. It is a meta-package that depends on kdl which contains the c++ version and pykdl which contains the generated python bindings."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "orocos-kdl python-orocos-kdl"

RDEPENDS_${PN} = "orocos-kdl python-orocos-kdl"

SRC_URI = "https://github.com/orocos/orocos-kdl-release/archive/release/melodic/orocos_kinematics_dynamics/1.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c4d64355fb2ccb5e3bb2c06f39f4222a"
SRC_URI[sha256sum] = "2ba6018b3fbbced816694fafd40bf7a9eea586ee7955ec91e4de7864493a2150"

S = "${WORKDIR}/orocos-kdl-release-release-melodic-orocos_kinematics_dynamics-1.4.0-0"

inherit catkin
