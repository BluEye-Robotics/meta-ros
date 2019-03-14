DESCRIPTION = "This package contains a C++ parser for the Collada robot description format. The parser reads a Collada XML robot description, and creates a C++ URDF model. Although it is possible to directly use this parser when working with Collada robot descriptions, the preferred user API is found in the urdf package."
AUTHOR = "Rosen Diankov"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "class-loader collada-dom urdfdom-headers rosconsole urdf urdf-parser-plugin urdf urdf-parser-plugin"

RDEPENDS_${PN} = "class-loader collada-dom rosconsole urdf-parser-plugin"

SRC_URI = "https://github.com/ros-gbp/collada_urdf-release/archive/release/melodic/collada_parser/1.12.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a12ee1cf95f34626a52ff5ee4a13cf8c"
SRC_URI[sha256sum] = "8edfcf03b750d196cca3a360cb7fbf5b41033bef4594c4dfc2f4978d2f701310"

ROS_SPN = "collada_urdf"
S = "${WORKDIR}/collada_urdf-release-release-melodic-collada_parser-1.12.12-0"

inherit catkin
