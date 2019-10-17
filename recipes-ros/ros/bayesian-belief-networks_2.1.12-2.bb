DESCRIPTION = "The bayesian_belief_networks package form https://github. com/eBay/bayesian-belief-networks, Authored by Neville Newey, Anzar Afaq, Copyright 2013 eBay Software Foundation"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=e8978a5103d23266fc6f8ec03dc9eb16"

DEPENDS = "rospy std-msgs mk git message-generation rospy std-msgs message-runtime"

RDEPENDS_${PN} = "rospy std-msgs message-runtime"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/bayesian_belief_networks/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0c74982361049ff184505ea501c67ade"
SRC_URI[sha256sum] = "96b63949f3aa189e24bec8709b37b6e32ac134123b6626c36fd2d094e113c8d6"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-bayesian_belief_networks-2.1.12-2"

inherit catkin
