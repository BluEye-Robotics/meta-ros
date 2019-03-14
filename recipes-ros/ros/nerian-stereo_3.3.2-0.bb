DESCRIPTION = "Driver node for SceneScan and SP1 stereo vision sensors by Nerian Vision Technologies"
AUTHOR = "Nerian Vision Technologies"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation roscpp std-msgs sensor-msgs cv-bridge boost roscpp std-msgs sensor-msgs cv-bridge message-runtime boost curl"

RDEPENDS_${PN} = "roscpp std-msgs sensor-msgs cv-bridge message-runtime boost curl"

SRC_URI = "https://github.com/nerian-vision/nerian_stereo-release/archive/release/melodic/nerian_stereo/3.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49722a73830ff47bdbc3e6daec820e70"
SRC_URI[sha256sum] = "cab332138682cb2a2fb8de01086a05bf0c8e7a81c2ad1f169e7b5304968539ca"

S = "${WORKDIR}/nerian_stereo-release-release-melodic-nerian_stereo-3.3.2-0"

inherit catkin
