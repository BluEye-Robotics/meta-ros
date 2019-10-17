DESCRIPTION = "This encapsulates the WebKit dependency for a specific ROS distribution and its Qt version"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-qt5-bindings-webkit"

RDEPENDS_${PN} = "python3-qt5-bindings-webkit"

SRC_URI = "https://github.com/ros-gbp/webkit_dependency-release/archive/release/melodic/webkit_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49eccdbfa8b9dc5ec16f1b2489c721fc"
SRC_URI[sha256sum] = "a187ab79ea2545b2dec0f48d74af9b4f3875f73ac649c8527e54e9ea6cda0e29"

S = "${WORKDIR}/webkit_dependency-release-release-melodic-webkit_dependency-1.1.0-0"

inherit catkin
