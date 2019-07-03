DESCRIPTION = "The rc_hand_eye_calibration_client package"
AUTHOR = "Christian Emmerich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl roscpp std-srvs geometry-msgs tf2 tf2-ros tf2-geometry-msgs dynamic-reconfigure message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_hand_eye_calibration_client/2.6.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "67e6e043eb6edb10bcea4e9b8ccd3435"
SRC_URI[sha256sum] = "0e5660da4f530723f4761156dc26012da8db7ff7a7a0e9ea70fb25b030a061aa"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_hand_eye_calibration_client-2.6.4-1"

inherit catkin
