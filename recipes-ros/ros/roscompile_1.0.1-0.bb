DESCRIPTION = "The roscompile package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ros-introspection"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wu-robotics/roscompile-release/archive/release/melodic/roscompile/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "42d5510382090071112afc0228b50cf4"
SRC_URI[sha256sum] = "09449c45a4b93695d6faf539f2d2a59f91c971d54f38beb9b0ecd317f18e702c"

S = "${WORKDIR}/roscompile-release-release-melodic-roscompile-1.0.1-0"

inherit catkin
