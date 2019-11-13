DESCRIPTION = "The rc_hand_eye_calibration_client package"
AUTHOR = "Christian Emmerich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl roscpp rcdiscover std-srvs geometry-msgs tf2 tf2-ros tf2-geometry-msgs dynamic-reconfigure message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_hand_eye_calibration_client/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0289366eb189534aea2e456b64769ba9"
SRC_URI[sha256sum] = "fde416e77743beb474834e6ae02a47c4d1346f953985c650f1789c9bb3fdc23c"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_hand_eye_calibration_client-2.7.0-1"

inherit catkin
