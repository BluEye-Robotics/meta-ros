DESCRIPTION = "UMD camera metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "uvc-camera jpeg-streamer"

RDEPENDS_${PN} = "uvc-camera jpeg-streamer"

SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/melodic/camera_umd/0.2.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aadca7b63e20c88d06f7d183baec526e"
SRC_URI[sha256sum] = "fb6705f080d0f3add72ec01a70dfb7e3efd9f264c9294a4a2ced40f9415597ee"

S = "${WORKDIR}/camera_umd-release-release-melodic-camera_umd-0.2.7-0"

inherit catkin
