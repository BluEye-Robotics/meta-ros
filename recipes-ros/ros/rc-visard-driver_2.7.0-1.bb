DESCRIPTION = "The rc_visard_driver provides data from a Roboception rc_visard 3D sensor on several ROS topics."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "protobuf-dev message-generation curl rc-genicam-api rc-dynamics-api nodelet roscpp rc-common-msgs sensor-msgs stereo-msgs image-transport dynamic-reconfigure geometry-msgs tf visualization-msgs nav-msgs diagnostic-updater"

RDEPENDS_${PN} = "protobuf message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_driver/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a70ae83b04c1bcb97b0d3266a9d5258c"
SRC_URI[sha256sum] = "6573998d90aec82fca42d993a634370012660920bf6e8f375c5a857c587be3a9"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_driver-2.7.0-1"

inherit catkin
