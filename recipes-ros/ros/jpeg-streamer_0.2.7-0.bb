DESCRIPTION = "tools for streaming JPEG-formatted CompressedImage topics over HTTP"
AUTHOR = "Ken Tossell"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp image-transport sensor-msgs roscpp image-transport sensor-msgs"

RDEPENDS_${PN} = "roscpp image-transport sensor-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/camera_umd-release/archive/release/melodic/jpeg_streamer/0.2.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2b69d878661e49f4de015f0c2ecbd38e"
SRC_URI[sha256sum] = "2f2d7e91f8743383d48353d1fc7fbbcd47ad1438a9029949cdd499ce3885e221"

ROS_SPN = "camera_umd"
S = "${WORKDIR}/camera_umd-release-release-melodic-jpeg_streamer-0.2.7-0"

inherit catkin
