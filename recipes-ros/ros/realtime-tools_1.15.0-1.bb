DESCRIPTION = "Contains a set of tools that can be used from a hard realtime thread, without breaking the realtime behavior."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/realtime_tools-release/archive/release/melodic/realtime_tools/1.15.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f03ef9441cdc6fb3c33b1a186c937e0c"
SRC_URI[sha256sum] = "7f931948bd7454781ba1f93a1dd3642a561c97ce7668d8c4b8e862a1616bcb5d"

S = "${WORKDIR}/realtime_tools-release-release-melodic-realtime_tools-1.15.0-1"

inherit catkin
