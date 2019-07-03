DESCRIPTION = "A ROS driver node for AVT/Prosilica Gigabit Ethernet (GigE) cameras."
AUTHOR = "Maintained by William Woodall - wwoodall@willowgarage.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "prosilica-gige-sdk roscpp std-msgs sensor-msgs diagnostic-updater diagnostic-msgs image-transport self-test driver-base dynamic-reconfigure camera-calibration-parsers polled-camera rosconsole prosilica-gige-sdk roscpp std-msgs sensor-msgs diagnostic-updater diagnostic-msgs image-transport self-test driver-base dynamic-reconfigure camera-calibration-parsers polled-camera"

RDEPENDS_${PN} = "prosilica-gige-sdk roscpp std-msgs sensor-msgs diagnostic-updater diagnostic-msgs image-transport self-test driver-base dynamic-reconfigure camera-calibration-parsers polled-camera"

SRC_URI = "https://github.com/ros-drivers-gbp/prosilica_driver-release/archive/release/melodic/prosilica_camera/1.9.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04ffedd2e103c0593a91d12c0d4195b2"
SRC_URI[sha256sum] = "7c2aafe58194390d9dbaaf25cf54cf5ba4060742e2ef9f10a0bb207c377d8202"

ROS_SPN = "prosilica_driver"
S = "${WORKDIR}/prosilica_driver-release-release-melodic-prosilica_camera-1.9.4-1"

inherit catkin
