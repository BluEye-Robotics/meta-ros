DESCRIPTION = "libCMT ROS Wrapper"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git opencv ca-certificates openssl opencv"

RDEPENDS_${PN} = "opencv"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libcmt/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e30743c2d2bf2d9df0ef8aee0f2b632"
SRC_URI[sha256sum] = "0c326290029afbb6e1a1772ce64ec363360b2996f06a0a21616ccc2c121ac164"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libcmt-2.1.13-1"

inherit catkin
