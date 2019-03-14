DESCRIPTION = "This encapsulates the GL dependency for a specific ROS distribution and its Qt version"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-qt5-bindings-gl"

RDEPENDS_${PN} = "python-qt5-bindings-gl"

SRC_URI = "https://github.com/ros-gbp/gl_dependency-release/archive/release/melodic/gl_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae960bd88ab9e1d167b43377cdaeac95"
SRC_URI[sha256sum] = "268881107d9d7d88c38530235fe1c38bd6343ffa7d326c451136895e06f3422e"

S = "${WORKDIR}/gl_dependency-release-release-melodic-gl_dependency-1.1.0-0"

inherit catkin
