DESCRIPTION = "The Industrial deprecated package contains nodes, launch files, etc. . . that are slated for deprecation. This package is the last place something will end up before being deleted. If you are missing a package/node and find it's contents here, then you should consider a replacement."
AUTHOR = "Shaun M. Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_deprecated/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b7128af1a4566e7b399793209d826ddf"
SRC_URI[sha256sum] = "22330dbdb44092750340bbd8a283441f65bd0135ddc3c08d5535736d0ceec9c9"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_deprecated-0.7.0-0"

inherit catkin
