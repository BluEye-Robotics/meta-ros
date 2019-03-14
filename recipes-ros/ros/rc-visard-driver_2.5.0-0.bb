DESCRIPTION = "The rc_visard_driver provides data from a Roboception rc_visard 3D sensor on several ROS topics."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "protobuf-dev message-generation curl rc-genicam-api rc-dynamics-api nodelet roscpp std-srvs sensor-msgs stereo-msgs image-transport dynamic-reconfigure geometry-msgs tf visualization-msgs nav-msgs diagnostic-updater"

RDEPENDS_${PN} = "protobuf message-runtime"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_driver/2.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3364f97b7be76934cca7daa660a6b19c"
SRC_URI[sha256sum] = "c22eca62d0d777efcc0589eb80b8f1a5a6b4ee31964696c6e4cd22b5d67d77d9"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_driver-2.5.0-0"

inherit catkin
