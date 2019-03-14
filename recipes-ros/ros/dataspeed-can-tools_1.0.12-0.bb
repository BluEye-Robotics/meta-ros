DESCRIPTION = "CAN bus introspection"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosbag roscpp roslib std-msgs can-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can_tools/1.0.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "00a90c4f6ba3027eb5752c7d5ed3e1fc"
SRC_URI[sha256sum] = "164f92e63ab8188d83e4107e9cb19fdf9db3c96a44282ffb85833bc0c58bfb98"

ROS_SPN = "dataspeed_can"
S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can_tools-1.0.12-0"

inherit catkin
