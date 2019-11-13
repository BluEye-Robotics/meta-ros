DESCRIPTION = "mini_maxwell"
AUTHOR = "Yusuke Furuta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roslib dynamic-reconfigure dynamic-reconfigure"

RDEPENDS_${PN} = "dynamic-reconfigure"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/mini_maxwell/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a404e0cc3b2fe19b41ca71e51942b05"
SRC_URI[sha256sum] = "41f120f3219017d91224594140bf4680584f6a9efdff8aaba4e170ed62202649"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-mini_maxwell-2.1.13-1"

inherit catkin
