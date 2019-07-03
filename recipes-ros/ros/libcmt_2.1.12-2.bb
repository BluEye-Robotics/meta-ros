DESCRIPTION = "libCMT ROS Wrapper"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git opencv ca-certificates openssl opencv"

RDEPENDS_${PN} = "opencv"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libcmt/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4878789d0df18481d51fddf625e021ca"
SRC_URI[sha256sum] = "7fe566a3dc97673f0ee77daa0f889c33e526c0ebac9b7fe09593b240563695be"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libcmt-2.1.12-2"

inherit catkin
