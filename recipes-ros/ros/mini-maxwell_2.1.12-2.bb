DESCRIPTION = "mini_maxwell"
AUTHOR = "Yusuke Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roslib dynamic-reconfigure dynamic-reconfigure"

RDEPENDS_${PN} = "dynamic-reconfigure"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/mini_maxwell/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3fdafcb5dc8df5ca720b6de04d1545a4"
SRC_URI[sha256sum] = "7f00ef62219190f48faa44f607e3910d329bfb6b0748a80b5e916951e3874fec"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-mini_maxwell-2.1.12-2"

inherit catkin
