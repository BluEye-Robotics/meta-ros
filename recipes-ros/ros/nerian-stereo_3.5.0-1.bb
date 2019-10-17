DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision GmbH"
AUTHOR = "Nerian Vision Technologies"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation roscpp std-msgs sensor-msgs cv-bridge boost dynamic-reconfigure nodelet roscpp std-msgs sensor-msgs cv-bridge message-runtime boost curl dynamic-reconfigure nodelet"

RDEPENDS_${PN} = "roscpp std-msgs sensor-msgs cv-bridge message-runtime boost curl dynamic-reconfigure nodelet"

SRC_URI = "https://github.com/nerian-vision/nerian_stereo-release/archive/release/melodic/nerian_stereo/3.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "37975870d09011444c3acced6a6b6673"
SRC_URI[sha256sum] = "ac5b61df9209fb01ccb8b20afc7a339450f5cffdb2bbb88d478b3c1a9dfc9dc4"

S = "${WORKDIR}/nerian_stereo-release-release-melodic-nerian_stereo-3.5.0-1"

inherit catkin
