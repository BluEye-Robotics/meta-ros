DESCRIPTION = "The package cob_canopen_motor implements a controller-drive component which is connected to a can-bus and works with a canopen-interface. "CanDriveItf" provides a - more or less - generic interface to the controller-drive components. "CanDrvie. . . " then implements a specific setup, e. g. an ELMO Harmonica Controller in case of the "CanDriveHarmonica"."
AUTHOR = "Christian Connette"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-generic-can cob-utilities roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_canopen_motor/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "182e280a11af1dea5442cecfc5e8925a"
SRC_URI[sha256sum] = "4c196b6bf39c6a262861ac99556bc59d67c14d6840c2602385baaf31738a3c06"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_canopen_motor-0.7.1-1"

inherit catkin
