DESCRIPTION = "ntpd_driver sends TimeReference message time to ntpd server"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime roscpp sensor-msgs cmake-modules poco"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/vooon/ntpd_driver-release/archive/release/melodic/ntpd_driver/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ee4022a75d2b95f13c9e8647cdc4a466"
SRC_URI[sha256sum] = "400a7dafabe870cfbda6a2c8238545f1891ce9f7acaab8746a3e64a1d2d98416"

S = "${WORKDIR}/ntpd_driver-release-release-melodic-ntpd_driver-1.2.0-1"

inherit catkin
