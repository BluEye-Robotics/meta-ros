DESCRIPTION = "Localization using fiducial markers"
AUTHOR = "Jim Vaughan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "aruco-detect fiducial-slam fiducial-msgs"

SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/melodic/fiducials/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3c924fbd60e7574c0c1850be0b6121d4"
SRC_URI[sha256sum] = "cdfb60356b3852cae3028e4e0fb674fffb1f6a65d825fe26f12fab272b5dc3a2"

S = "${WORKDIR}/fiducials-release-release-melodic-fiducials-0.11.0-1"

inherit catkin
