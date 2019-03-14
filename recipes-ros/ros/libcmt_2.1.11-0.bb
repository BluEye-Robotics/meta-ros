DESCRIPTION = "libCMT ROS Wrapper"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git opencv ca-certificates openssl opencv"

RDEPENDS_${PN} = "opencv"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/libcmt/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "66dbeb691c8fc90334419309cf76c8d5"
SRC_URI[sha256sum] = "26abb0780e7ebc0d27e52c3fdf19a4f29b22d747b6744441ee132ebc3850fdfd"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-libcmt-2.1.11-0"

inherit catkin
