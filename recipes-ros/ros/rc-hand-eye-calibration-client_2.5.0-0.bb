DESCRIPTION = "The rc_hand_eye_calibration_client package"
AUTHOR = "Christian Emmerich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl roscpp std-srvs geometry-msgs dynamic-reconfigure message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_hand_eye_calibration_client/2.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a87f8b5b7b439b8eef752669d666f520"
SRC_URI[sha256sum] = "4a0f8dbf4cf73db3976b83dea3cb12c86d3bc81e41241ec3a1b00bdb23245c85"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_hand_eye_calibration_client-2.5.0-0"

inherit catkin
